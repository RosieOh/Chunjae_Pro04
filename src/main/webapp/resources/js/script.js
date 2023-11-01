
(function ($) {
  "use strict";

  $(".navbar-burger").click(function () {
    $(".navbar-burger").toggleClass("is-active");
    $(".navbar-menu").toggleClass("is-active");
  });
  if ($(window).width() < 1024) {
    $(".navbar-menu .has-dropdown").on("click", function (e) {
      $(this).children(".navbar-dropdown").toggle();
    });
  }
})(jQuery);
