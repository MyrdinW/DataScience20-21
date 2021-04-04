
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<?php
$host = "rdbms.strato.de";
$user = "U3432127";
$password = "Hallo112!@@";
$dbname = "DB3432127";

$con = mysqli_connect($host, $user, $password, $dbname);
// Checken of er verbinding is
if (!$con) {
    die("Verbinding mislukt: " . mysqli_connect_error());
}
    //sorry met die mooie grafiek lukte het niet met een loop
    //genre 1
    $id = 1;
    $sql_id = "SELECT * FROM genre_desc WHERE id=$id";
    $sql_query_id = mysqli_query($con,$sql_id);
    $result_id = mysqli_fetch_object($sql_query_id);

    //genre 2
    $id2 = 2;
    $sql_id2 = "SELECT * FROM genre_desc WHERE id=$id2";
    $sql_query_id2 = mysqli_query($con,$sql_id2);
    $result_id2 = mysqli_fetch_object($sql_query_id2);

    //genre 3
    $id3 = 3;
    $sql_id3 = "SELECT * FROM genre_desc WHERE id=$id3";
    $sql_query_id3 = mysqli_query($con,$sql_id3);
    $result_id3 = mysqli_fetch_object($sql_query_id3);

        //genre 4
    $id4 = 4;
    $sql_id4 = "SELECT * FROM genre_desc WHERE id=$id4";
    $sql_query_id4 = mysqli_query($con,$sql_id4);
    $result_id4 = mysqli_fetch_object($sql_query_id4);

        //genre 5
    $id5 = 5;
    $sql_id5 = "SELECT * FROM genre_desc WHERE id=$id5";
    $sql_query_id5 = mysqli_query($con,$sql_id5);
    $result_id5 = mysqli_fetch_object($sql_query_id5);

        //genre 6
    $id6 = 6;
    $sql_id6 = "SELECT * FROM genre_desc WHERE id=$id6";
    $sql_query_id6 = mysqli_query($con,$sql_id6);
    $result_id6 = mysqli_fetch_object($sql_query_id6);

        //genre 7
    $id7 = 7;
    $sql_id7 = "SELECT * FROM genre_desc WHERE id=$id7";
    $sql_query_id7 = mysqli_query($con,$sql_id7);
    $result_id7 = mysqli_fetch_object($sql_query_id7);

       //gemiddelde rating alle films
       $avgid = 1;
    $sql_avgscore = "SELECT * FROM average_rating WHERE id=$avgid";
    $sql_query_avgscore = mysqli_query($con,$sql_avgscore);
    $result_avgscore = mysqli_fetch_object($sql_query_avgscore);

           //genre minste films
    $min_id = 25;
    $sql_minamount = "SELECT * FROM genre_desc WHERE id=$min_id";
    $sql_query_minamount = mysqli_query($con,$sql_minamount);
    $result_minamount = mysqli_fetch_object($sql_query_minamount);
    

            //films met hoogste rating van 1990-2010
    $scoreid = 1;
    $sql_score = "SELECT * FROM highest_rating WHERE id=$scoreid";
    $sql_query_score = mysqli_query($con,$sql_score);
    $result_score = mysqli_fetch_object($sql_query_score);

           //films met laagste rating van 1990-2010
    $scoreid2 = 1;
    $sql_score2 = "SELECT * FROM lowest_movie_rating WHERE id=$scoreid2";
    $sql_query_score2 = mysqli_query($con,$sql_score2);
    $result_score2 = mysqli_fetch_object($sql_query_score2);



?>

