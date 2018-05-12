(function() {
    'use strict';

    angular.module('app')
        .controller('NewJobController', NewJobController );

    NewJobController.$inject = ['$http', '$scope'];

    function NewJobController($http, $scope) {
        console.log("NewJobController.");

        $scope.addJob = function(){

            var successCallBack = function(response){
                // success response found from server
            };

            var errorCallBack = function(response){
                // error response found from server
            };
                var data = {
                    jobTitle: $scope.jobTitle,
                    description: $scope.description,
                    category: $scope.category,
                    fare: $scope.fare
                };
                console.log(data);
                $http.post('/api/job/add', data).then(successCallBack, errorCallBack);
        };
    }

})();