var allArticle = angular.module('category.all',[])
.controller('categoryAllArticleCtr', function($scope, $stateParams, $http){

        getArticleList();

        function getArticleList(){
            console.log('get all article');
            var path = $scope.titleServisAdress + "/title/all";

                $http.get(path)
                    .then(function(response) {
                        $scope.articleList =  response.data;
                        console.log(response.data);
                    });
        }


});