<?php
include("config.php");

$dataPoints = array( 
	array("y" => $result_id->ammount, "label" => "$result_id->genre" ),
	array("y" => $result_id2->ammount, "label" => "$result_id2->genre" ),
	array("y" => $result_id3->ammount, "label" => "$result_id3->genre" ),
	array("y" => $result_id4->ammount, "label" => "$result_id4->genre" ),
	array("y" => $result_id5->ammount, "label" => "$result_id5->genre" ),
	array("y" => $result_id6->ammount, "label" => "$result_id6->genre" ),
	array("y" => $result_id7->ammount, "label" => "$result_id7->genre" ),
);
 
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>IMDB Databases logic</title>
    <link rel="stylesheet" href="style.css" type="text/css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.1/css/all.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script>
window.onload = function() {
 
var chart = new CanvasJS.Chart("chartContainer", {
	animationEnabled: true,
	theme: "light2",
	title:{
		text: "Aantal films per Genre"
	},
	axisY: {
		title: "Aantal films"
	},
	data: [{
		type: "column",
		yValueFormatString: "#,##0.## films",
		dataPoints: <?php echo json_encode($dataPoints, JSON_NUMERIC_CHECK); ?>
	}]
});
chart.render();
 
}
</script>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {
        'packages':['geochart'],
        // Note: you will need to get a mapsApiKey for your project.
        // See: https://developers.google.com/chart/interactive/docs/basic_load_libs#load-settings
        'mapsApiKey': 'AIzaSyD-9tSrke72PouQMnMX-a7eZSW0jkFMBWY'
      });
      google.charts.setOnLoadCallback(drawRegionsMap);

      function drawRegionsMap() {
        var data = google.visualization.arrayToDataTable([
          ['Country', 'Movies'],
          
['US', 762697],
['GB', 218730],
['Japan', 88149],
['France', 83428],
['Canada', 69406],
['Germany', 65393],
['Spain', 58724],
['Australia', 50976],
['Italy', 42389],
['India', 40071],
['Argentina', 29887],
['Mexico', 25854],
['Netherlands', 20521],
['Brazil', 20507],
['Portugal', 19992],
['West Germany', 17669],
['Denmark', 14759],
['Sweden', 14463],
['Belgium', 13741],
['Philippines', 12369],
['Finland', 12217],
['Greece', 12066],
['Turkey', 10703],
['Russia', 10181],
['Austria', 10119],
['Soviet Union', 9900],
['Hong Kong', 9630],
['South Korea', 8727],
['Hungary', 8385],
['Poland', 7751],
['Yugoslavia', 7414],
['Switzerland', 7250],
['Ireland', 6771],
['China', 6630],
['Norway', 5850],
['Israel', 5498],
['Czech Republic', 5294],
['Czechoslovakia', 4729],
['New Zealand', 4308],
['Iran', 4134],
['East Germany', 4067],
['Taiwan', 4044],
['Nigeria', 3822],
['South Africa', 3693],
['Romania', 3574],
['Chile', 3292],
['Egypt', 3230],
['Bulgaria', 2636],
['Croatia', 2580],
['Colombia', 2376],
['Indonesia', 2353],
['Cuba', 2095],
['Singapore', 1981],
['Thailand', 1876],
['Venezuela', 1705],
['Serbia', 1695],
['Pakistan', 1686],
['Ukraine', 1540],
['Malaysia', 1452],
['Peru', 1206],
['Iceland', 1142],
['Albania', 1134],
['Estonia', 1112],
['Bangladesh', 1019],
['United Arab Emirates', 972],
['Puerto Rico', 946],
['Georgia', 940],
['Bosnia and Herzegovina', 908],
['Slovenia', 901],
['Slovakia', 886],
['Lebanon', 859],
['Morocco', 768],
['Dominican Republic', 659],
['Luxembourg', 640],
['Latvia', 618],
['Vietnam', 574],
['Uruguay', 566],
['Federal Republic of Yugoslavia', 558],
['Ecuador', 532],
['Cyprus', 530],
['Lithuania', 520],
['Nepal', 519],
['Sri Lanka', 513],
['Kenya', 484],
['Bolivia', 414],
['Costa Rica', 408],
['Occupied Palestinian Territory', 395],
['Serbia and Montenegro', 363],
['Republic of Macedonia', 362],
['Iraq', 357],
['Syria', 351],
['Armenia', 350],
['Kazakhstan', 343],
['Cambodia', 335],
['Azerbaijan', 317],
['Tunisia', 315],
['Algeria', 302],
['Qatar', 284],
['Guatemala', 277],
['Afghanistan', 265],
['Jordan', 262],
['Senegal', 259],
['Ghana', 253],
['Uganda', 250],
['Belarus', 249],
['Haiti', 248],
['Panama', 231],
['Trinidad and Tobago', 222],
['Malta', 211],
['Paraguay', 203],
['Tanzania', 190],
['Burkina Faso', 184],
['Nicaragua', 169],
['Ethiopia', 165],
['Jamaica', 156],
['Saudi Arabia', 152],
['Mongolia', 140],
['Kosovo', 140],
['Cameroon', 140],
['Bahrain', 134],
['Guadeloupe', 128],
['Bahamas', 125],
['San Marino', 125],
['Mali', 122],
['Rwanda', 117],
['Myanmar', 117],
['Honduras', 115],
['Kuwait', 111],
['Uzbekistan', 109],
['Moldova', 108],
['North Korea', 108],
['Mozambique', 107],
['U.S. Virgin Islands', 107],
['Zimbabwe', 106],
['Angola', 105],
['El Salvador', 105],
['Kyrgyzstan', 102],
['Congo', 100],
['Laos', 93],
['Namibia', 81],
['Macao', 77],
['Ivory Coast', 77],
['Sudan', 75],
['Fiji', 73],
['Montenegro', 68],
['Zambia', 67],
['Gibraltar', 66],
['Korea', 66],
['Niger', 65],
['Mauritius', 63],
['Greenland', 61],
['Bhutan', 59],
['Madagascar', 53],
['Monaco', 53],
['Sierra Leone', 51],
['Liberia', 50],
['Belize', 50],
['Guam', 49],
['Libya', 48],
['Liechtenstein', 48],
['Guinea', 47],
['Barbados', 47],
['Benin', 44],
['Netherlands Antilles', 44],
['Togo', 43],
['Gabon', 43],
['Tajikistan', 42],
['Democratic Republic of the Congo', 41],
['Papua New Guinea', 40],
['Malawi', 39],
['Bermuda', 37],
['Faroe Islands', 36],
['Burma', 36],
['Botswana', 36],
['Aruba', 35],
['Mauritania', 35],
['Somalia', 34],
['Cape Verde', 33],
['French Polynesia', 32],
['Oman', 31],
['Chad', 30],
['Martinique', 30],
['Yemen', 29],
['Burundi', 28],
['North Vietnam', 28],
['Guyana', 27],
['Palestine', 26],
['Andorra', 26],
['Maldives', 25],
['Swaziland', 25],
['Reunion', 24],
['Suriname', 24],
['Antigua and Barbuda', 24],
['Lesotho', 22],
['Antarctica', 22],
['Guinea-Bissau', 22],
['Isle of Man', 20],
['Central African Republic', 19],
['Cayman Islands', 18],
['Gambia', 17],
['Timor-Leste', 15],
['Western Sahara', 15],
['Turkmenistan', 13],
['Marshall Islands', 13],
['Cook Islands', 12],
['New Caledonia', 12],
['Eritrea', 11],
['Tonga', 11],
['Tuvalu', 11],
['Saint Vincent and the Grenadines', 11],
['Vanuatu', 11],
['Federated States of Micronesia', 10],
['Dominica', 10],
['Comoros', 9],
['Palau', 9],
['Saint Lucia', 9],
['French Guiana', 9],
['Brunei Darussalam', 9],
['American Samoa', 9],
['Samoa', 9],
['Solomon Islands', 8],
['Equatorial Guinea', 8],
['Grenada', 8],
['Kiribati', 8],
['Siam', 7],
['Saint Kitts and Nevis', 6],
['Zaire', 6],
['Seychelles', 5],
['Djibouti', 5],
['Holy See (Vatican City State)', 4],
['Sao Tome and Principe', 4],
['Svalbard and Jan Mayen', 4],
['Nauru', 3],
['Montserrat', 3],
['Northern Mariana Islands', 2],
['Saint Helena', 2],
['South Georgia and the South Sandwich Islands', 2],
['Turks and Caicos Islands', 2],
['Wallis and Futuna', 1],
['Niue', 1],
['Falkland Islands', 1],
['Anguilla', 1]
        ]);

        var options = {};

        var chart = new google.visualization.GeoChart(document.getElementById('regions_div'));

        chart.draw(data, options);
      }
    </script>

</head>
<body>

<div class="wrapper">
    <h1>Vragen</h1>
    <div class="preview-container">
        <h2>Uit welk land komen de meeste films?</h2>
         <div id="regions_div" style="margin: auto; width: 900px; height: 500px;"></div>

    </div>
        <div class="preview-container">
        <h2>Welke genres hebben de meeste films? </h2>
         <div id="chartContainer" style="margin: auto; height: 370px; width: 75%;"></div>
        <script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
    </div>
    <div class="preview-container">
        <h2>Welk genre heeft de minste films?  </h2>
       <?php echo "Genre: </br>". $result_minamount->genre . "" ?>
    </div>

            <div class="preview-container">
        <h2>Welke film uit 1990-2010 heeft de beste rating?  </h2>
        <?php echo "Movie: ". $result_score->movie . "</br> Score: ". $result_score->score; ?>
    </div>

                <div class="preview-container">
        <h2>Welke film uit 1990-2010 heeft de slechtste rating?  </h2>
        <?php echo "Movie: ". $result_score2->movie . "</br> Score: ". $result_score2->score; ?>
    </div>


    <div class="preview-container">
        <h2>Wat is de gemiddelde rating van alle films op IMDB?  </h2>
       <?php 
             echo "De gemiddelde rating van alle films op IMDB is: </br>". $result_avgscore->score . "";
            ?>
    </div>
       <div class="preview-container">
        <h2>Uit welk jaar komt de film met de slechtste rating?</h2>
        <?php echo "Movie: ". $result_score2->movie . "</br> Jaartal: ". $result_score2->year; ?>
    </div>
                     <div class="preview-container">
        <h2>Welke acteur speelt in de meeste films?</h2>
        Direct antwoord
    </div>



</div>
</body>
</html>