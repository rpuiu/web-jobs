(function() {
    'use strict';

    angular.module('app')
        .controller('DisplayJobController', DisplayJobController );

    DisplayJobController.$inject = ['$http', '$scope'];

    function DisplayJobController($http, $scope) {
        var vm = this;
        vm.empWithJobs = [];

        getAllJobsWithEmployees();

        function getAllJobsWithEmployees() {
            var url = '/api/employees/';
            var jobPromise = $http.get(url);
            jobPromise.then(function(response){
                console.log(response.data);
                vm.empWithJobs = response.data;
            });
        }
    }

})();