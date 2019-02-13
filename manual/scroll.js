document.addEventListener('DOMContentLoaded', init)

function init() {
  const content = document.querySelector('#content')
  const toc = document.querySelector('#table-of-contents')

  window.addEventListener('scroll', debounce(ev => {
    const content = document.querySelector('#content')
    const toc = document.querySelector('#table-of-contents')

    // Find the index of the first visible heading in the viewport
    const top = window.scrollY + 10 // add a little slack since offsetTop is the
                                    // top of the border of the element
    const hs = content.querySelectorAll('h2, h3, h4, h5')
    const first = Array.prototype.findIndex.call(hs, h => h.offsetTop > top)

    // The current heading is the one preceding, if any
    const current = hs[Math.max(first - 1, 0)]

    // Find it in the table of contents
    const currentToc = toc.querySelector(`a[href="#${current.id}"]`)

    // Select it
    const selected = toc.querySelector('.selected')
    if (selected) {
      selected.classList.remove('selected')
    }
    if (currentToc) {
      currentToc.classList.add('selected')
    }
  }))
}

function debounce(f, delay = 50) {
  let timeout
  return () => {
    if (timeout) {
      clearTimeout(timeout)
    }
    timeout = setTimeout(f, delay)
  }
}
