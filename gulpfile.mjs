import {dest, parallel, series, src, watch} from 'gulp';
import less from 'gulp-less';
import babel from 'gulp-babel';
// import concat from 'gulp-concat';
import uglify from 'gulp-uglify';
// import rename from 'gulp-rename';
import cleanCSS from 'gulp-clean-css';
import {deleteAsync} from 'del';
import postcss from "gulp-postcss"
import autoprefixer from "autoprefixer";

const staticPath = "src/main/resources/static/"

const paths = {
    styles: {
        src: staticPath + 'less/**/*.less',
        dest: staticPath + 'dist/css/'
    },
    scripts: {
        src: staticPath + 'js/**/*.js',
        dest: staticPath + 'dist/js/'
    }
}

const clear = () => deleteAsync(paths.styles.dest)


export function styles() {
    return src(paths.styles.src)
        .pipe(less())
        .pipe(postcss([autoprefixer({grid: 'autoplace'})]))
        .pipe(cleanCSS())
        .pipe(dest(paths.styles.dest));
}

export function scripts() {
    return src(paths.scripts.src)
        .pipe(babel({
            presets: ['@babel/preset-env'],
        }))
        .pipe(uglify())
        .pipe(dest(paths.scripts.dest))
}

/**
 * 直接编译
 */
export const build = series(clear, parallel(styles,scripts))

/**
 * watch文件变更并编译
 */
export const watchFile = () => {
    watch(paths.styles.src, styles);
    watch(paths.scripts.src, scripts);
};
