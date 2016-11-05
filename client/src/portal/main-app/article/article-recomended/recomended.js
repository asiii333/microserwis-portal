var articleRecomended = angular.module('article.recomended',[])

.controller('articleRecomendedCtr', function($scope, $stateParams, $http){


     var articleNum =  $stateParams.artNum;  //ze sciezki
     getArticle(articleNum);



     function getArticle(articleNum){
        console.log('get article title');
         $http.get('http://localhost:2223/title/' + articleNum).
                then(function(response) {
                   console.log(response.data);
                   $scope.article = response.data;
                   getSimilarArticle();
                });
     }

     function getSimilarArticle(){
        console.log('get similar article list for: ' + $scope.article.category);
                            var path = $scope.titleServisAdress + "/title/main/" + $scope.article.category ;

                                $http.get(path)
                                    .then(function(response) {
                                        $scope.similarArticle =  response.data;
                                        console.log(response.data);
                                    });
     }

});