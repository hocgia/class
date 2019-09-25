<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="csrf-token" content="{{ csrf_token() }}">
    <title>Survey</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body class="container">
<h3 class="text-center">Survey</h3>
<div class="row">
    <div class="col-3"></div>
    <div class="col-6">
        <div id="notify"></div>
        <form id="form">
            <div class="form-group">
                <input id="name" class="form-control" type="text" placeholder="Input name" name="name" required>
            </div>
            <div class="form-group">
                <input id="email" class="form-control" type="text" placeholder="Input email" name="email" required>
            </div>
            <div class="form-group">
                <input id="telephone" class="form-control" type="text" placeholder="Input telephone" name="telephone" required>
            </div>
            <div class="form-group">
                <textarea id="feedback" class="form-control" name="feedback" cols="100%" rows="2" placeholder="Input feedback"></textarea>
            </div>
            <div class="form-group">
                <button id="submit" class="btn btn-outline-success">Submit</button>
            </div>
        </form>
    </div>
    <div class="col-3"></div>
</div>

<script>
    $('form').submit(false);
    $('#submit').click(function () {
        let name = $('#name').val();
        let email = $('#email').val();
        let telephone = $('#telephone').val();
        let feedback = $('#feedback').val();
        if(name.length !== 0 && email.length !== 0 && telephone.length !== 0 && feedback.length !== 0){
            $.ajax({
                url: '/survey/store',
                method: 'post',
                data: {
                    '_token': $('meta[name=csrf-token]').attr("content"),
                    'name': name,
                    'email': email,
                    'telephone': telephone,
                    'feedback': feedback
                },
                success: function () {
                    $('#notify').html('<span class="text-success">Submit success</span>');
                    $('#form').hide()
                },
                error: function () {
                    $('#notify').html('<span class="text-danger">Submit error</span>');
                }
            });
        }
    })
</script>
</body>
</html>
