angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('http://localhost:2221/hello').
        then(function(response) {
            $scope.greeting = response.data;
        });
});