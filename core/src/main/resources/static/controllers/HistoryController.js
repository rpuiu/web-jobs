
(function () {
 'use strict';

 angular.module('app')
    .controller('HistoryController', HistoryController);

    HistoryController.$inject = ['$http'];

 function HistoryController ($http){
    console.log("asada");
    
    var vm = this;

    vm.history = [];
    vm.getAll = getAll;
    init();

    function init(){
        getAll();
    }

    function getAll(){
        var url = '/history';
        var historyPromise = $http.get(url);
        historyPromise.then(function(response){
            vm.history = response.data;
        });
    }

 }

})();