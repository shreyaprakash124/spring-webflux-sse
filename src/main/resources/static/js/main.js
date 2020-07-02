function loadNotifications() {

	this.source = null;

	this.start = function() {

		var notificationTable = document.getElementById("notifications");

		const userValue = new URLSearchParams(window.location.search).get('userId');
		
		this.source = new EventSource("/notifications?userId="+userValue);

		this.source.addEventListener("message", function(event) {

			var notification = JSON.parse(event.data);

			var row = notificationTable.getElementsByTagName("tbody")[0]
					.insertRow(0);
			var cell0 = row.insertCell(0);
			var cell1 = row.insertCell(1);
			var cell2 = row.insertCell(2);

			cell0.className = "author-style";
			cell0.innerHTML = notification.userId;

			cell1.className = "text";
			cell1.innerHTML = notification.notificationDetails;

			cell2.className = "date";
			cell2.innerHTML = new Date().toLocaleDateString();

		});

		this.source.onerror = function() {
			this.close();
		};

	};

	this.stop = function() {
		this.source.close();
	}

}

notification = new loadNotifications();

window.onload = function() {
	notification.start();
};
window.onbeforeunload = function() {
	notification.stop();
}