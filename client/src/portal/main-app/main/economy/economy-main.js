var mainPageEconomy = angular.module('mainPage.economy',[])
.controller('mainPageEconomyCtr', function($scope, $http){

        getArticle();

        function getArticle(){
            console.log('get article for main-module economy');

            var path = $scope.titleServisAdress + "/title/main/gospodarka";

            $http.get(path)
                .then(function(response) {
                    $scope.articles =  response.data;
                    console.log(response.data);
            });
        }


});