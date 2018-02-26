/**
 *  Angular JS Controller !!
 */

var app=angular.module("myApp", []);
app.controller("myCont",['$scope','$http', function($scope, $http) {
	
	$http.get("http://localhost:8080/bookProject/rest/controller/books").then(function(response) {

	$scope.bookList = response.data;

	console.log($scope.bookList);
	
	var Length=$scope.bookList.length;

	$scope.totalItems = Length;
	alert("size is : "+Length );
	});
}])