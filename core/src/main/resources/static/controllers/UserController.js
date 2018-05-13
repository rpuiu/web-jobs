(function() {
    'use strict';

    angular.module('app')
        .controller('UserController', UserController );

    UserController.$inject = ['$http', '$scope'];

    function UserController($http, $scope) {
        console.log("UserController.");

        $scope.addUser = function(){
            
            var successCallBack = function(response){
                // success response found from server
            };

            var errorCallBack = function(response){
                // error response found from server
            };
            var isEmployee =  "Angajat" === $scope.isEmployee;

                var data = {
                    personEntity: {
                        name: $scope.name,
                        surname: $scope.surname,
                        username: $scope.username,
                        phone: $scope.phone,
                        email: $scope.email,
                    },
                    isEmployee: isEmployee
                };
                console.log(data);
                $http.post('/api/user/add', data).then(successCallBack, errorCallBack);
        };
    }
//TODO empty fields after submit
})();