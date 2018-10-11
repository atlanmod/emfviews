function expand(e, fn) {
  $(e).show()

  const targets = fn(e)

  if (targets) {
    $('li')
      .filter((_, e) => targets.includes($(e).find('.name').text()))
      .each((_, e) => expand(e, fn))
  }
}

$(document).click(function(ev) {
  if (ev.button != 0)
    return

  const el = $(ev.target).closest('li')

  // Reset view
  if (el.length === 0) {
    $('li').show()
    $('.open').removeClass('open')
    return
  }

  // Mark the current entry
  $('.open').removeClass('open')
  el.addClass('open')

  // Hide all the others
  $('li').not('.open').hide()

  expand(el, e => $(e).data('to')   && $(e).data('to').split('::'))
  expand(el, e => $(e).data('from') && $(e).data('from').split('::'))
})
