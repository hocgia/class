<?php

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', 'Survey@index');

Route::name('survey.')->prefix('/survey')->group(function (){
   Route::get('/', 'Survey@index')->name('index');
   Route::post('/store', 'Survey@store')->name('store');
});
