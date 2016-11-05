var mainPagePoland = angular.module('mainPage.poland',[])
.controller('mainPagePolandCtr', function($scope, $http){

        getArticle();

        function getArticle(){
            console.log('get article for main-module poland');

            var path = $scope.titleServisAdress + "/title/main/polska";

            $http.get(path)
                .then(function(response) {
                    $scope.articles =  response.data;
                    console.log(response.data);
            });
        }

});