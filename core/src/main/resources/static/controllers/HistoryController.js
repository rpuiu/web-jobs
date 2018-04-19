(function() {
    'use strict';

    angular.module('app')
        .controller('HistoryController', HistoryController);
    
    HistoryController.$inject = ['$http'];
    
    function HistoryController($http) {
        console.log("HistoryController.");
        
        var vm = this;
        
        vm.history = [];
        vm.getAll = getAll;
        init();
        
        function init() {
            getAll();
        }
        
        function getAll() {
            var url = '/api/history';
            console.log("here");
            var historyPromise = $http.get(url);
            historyPromise.then(function(response){
                console.log(response.data);
                vm.history = response.data;
            });
        }    
    }

})();