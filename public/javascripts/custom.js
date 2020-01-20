function sendPostRequest(formId, username, chatbox ) {
    var form = $('#'+formId);
    var chat = $('#'+chatbox);

    $.ajax({
        url: form.attr( 'action' ),
        method: "POST",
        data: form.serialize(),
        success: function () {

        },
        error: function() {
            window.location.reload();
        }
    });
    form[0].reset();

    setTimeout(function(){

        }, 1000);

    var chatMessageUrl = 'getChat/' + username;
		var oldscrollHeight = chat.attr('scrollHeight') - 20;
    $.ajax({
        url: chatMessageUrl,
        method: "GET",
        success: function(data) {
            chat.html(data);
            var newscrollHeight = chat.attr('scrollHeight') - 20;
            				if(newscrollHeight > oldscrollHeight){
            					chat.animate({ scrollTop: newscrollHeight }, 'normal');
            				}
        },
         error: function() {
             window.location.reload();
         }
    });

}

function GFG_Fun(time) {
    var date = new Date(time);
    down.innerHTML = date.toString();
}