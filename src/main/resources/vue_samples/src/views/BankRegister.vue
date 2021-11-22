<template>
  <div class="about">
    <h1>Create Account</h1>
    Account number: <input v-model="accountNumber"> <br>
    <button v-on:click="createAccount">Create Account</button>
    <button v-on:click="getBalance">Get Balance</button>
    Balance: {{balance}}
  </div>
</template>
<script>
export default {
  methods: {
    createAccount: function () {
      this.$http.get("/bank2/createAccount?accountNumber=" + this.accountNumber)
    },
    getBalance: function () {
      this.$http.get("/bank2/getBalance?accountNumber=" + this.accountNumber)
          .then(result => {
            this.balance = result.data
          })
    }
  },
  data: function () {
    return {
      accountNumber: "",
      balance: ''
    }
  }
}
</script>