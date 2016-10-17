angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('http://localhost:2222/hello').
        then(function(response) {
            $scope.greeting = response.data;
        });
});