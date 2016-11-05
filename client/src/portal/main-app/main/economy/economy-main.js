var mainPageEconomy = angular.module('mainPage.economy',[])
.controller('mainPageEconomyCtr', function($scope){

        getArticle();

        function getArticle(){
            console.log('get article for main-module economy');

            var path = $scope.titleServisAdress + "/title/main/ekonomia";

            $http.get(path)
                .then(function(response) {
                    $scope.articles =  response.data;
                    console.log(response.data);
            });
        }


});