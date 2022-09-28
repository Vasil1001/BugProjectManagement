
$('document').ready(function(){
    console.log("1 user document ready func()");
// # TICKET SCRIPT START
    $('.table #usersEditButton').on('click',function(event){
            event.preventDefault();

            var href= $(this).attr('href');
            console.log("2 .table .btn onClick, func()");

        $.get(href, function(user, status){
            $('#user-edit-id').val(user.id);
            $('#user-edit-first-name').val(user.firstname);
            $('#user-edit-last-name').val(user.lastname);
            $('#user-edit-email').val(user.email);
            $('#user-edit-phone').val(user.phoneNumber);
            $('#user-edit-assignedTickets').val(user.assignedTickets);

            });
            $('#userEditModal').modal();
            console.log("3 edit .modal()");

        });

        $('.table #usersDeleteButton').on('click',function(event) {
                event.preventDefault();
                var href = $(this).attr('href');
                $('#userDeleteModal1 #userDelRef1').attr('href', href);
                $('#userDeleteModal1').modal();

        }); // # TICKET SCRIPT END

});