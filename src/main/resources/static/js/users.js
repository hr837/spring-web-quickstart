new Vue({
  el: '#app',
  data: function () {
    return {
      message: "",
      dataSet:[]
    }
  },
  methods: {
    onloadData() {
      this.message = "Loading"
      axios.get('/employee/list').then(res => {
        if(res.status === 200 && res.data.status){
            this.message = ""
            this.dataSet = res.data.data
            this.$message.success("获取成功")
        }else{
            this.message = res.data.message
            this.$message.error("获取失败")
        }
      })
    },
    fetchData(){
        const mockData = () => Promise.resolve('Hello')
        mockData().then(res =>{
            console.log(res)
        })
    }
  }
})