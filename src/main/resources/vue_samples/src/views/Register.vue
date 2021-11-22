<template>
  <div class="home">
    Account Number: <input v-model="client.name"> <br>
    Address: <input v-model="client.address"> <br>
    Password: <input v-model="client.password" type="password"> <br>
    <button v-on:click="register()">Loo konto</button>
    Data: {{client}}
    <button v-on:click="getData()">Get Data</button>

    <table>
      <tr>
        <th>Nimi</th>
        <th>Aadress</th>
        <th>Parool</th>
      </tr>
      <tr v-for="row in clients">
        <td>{{row.name}}</td>
        <td>{{row.address}}</td>
        <td>{{row.password}}</td>
      </tr>
    </table>
  </div>
</template>

<script>
export default {
  methods: {
    register: function (){
      this.$http.post('/vue-test/register', this.client)
      this.clients.push(this.client);
    },
    getData: function() {
      this.$http.get('/vue-test/data')
      .then(response => {
        this.client = response.data
      })
    },
    getAllData: function(){
      this.$http.get("/vue-test")
      .then(response => {
        this.clients = response.data
      })
    }
  },
  data: function() {
    return{
      client: {},
      clients: []
    }
  }, mounted() {
    this.getAllData()
  }
}
</script>
