<template>
    <div class="wrap">
        <reckey-keyboard></reckey-keyboard>
        <reckey-keyboard-detail></reckey-keyboard-detail>
    </div>
</template>

<script>
import ReckeyKeyboardDetail from '../components/ReckeyKeyboardDetail.vue'
import ReckeyKeyboard from '../components/ReckeyKeybooad.vue'
export default {
    components : {
        ReckeyKeyboard,
        ReckeyKeyboardDetail
    }
}
</script>

<style>
.popup {
    opacity: 0.3;
    z-index: -1;
}

main {
    width: 90%;
    overflow-y: scroll;
    margin: 0 3.5416666666666665%;
}

main::-webkit-scrollbar {
    display: none;
}

.model {
    color: var(--main-color);
    font-size: 1.8rem;
    margin-top: 1rem;
    margin-bottom: 0.5rem;
}

.keyboard-info {
    padding: 0;
    list-style: none;
    border-top: 1px solid var(--border-color);
    display: flex;
    flex-direction: column;
}

.image {
    height: 25rem;
    margin: 1rem 0;
    border: 0.2rem solid var(--border-color);
    border-radius: 11px;
}

img {
    width: 100%;
    max-width: 32rem;
    height: 100%;
    max-height: 32rem;
    display: block;
    margin: 0 auto;
}

.detail {
    height: 3rem;
    position: relative;
}

.detail span {
    padding: 0 0.5rem;
}

.detail > .key {
    border: 1px solid var(--main-color);
    border-radius: 1rem;
    background-color: bisque;
}

.detail > .type-blue {
    background-color: var(--blue-key-color);
    color: #fff;
}

.detail > .type-brown {
    background-color: var(--brown-key-color);
    color: #fff;
}

.detail > .type-red {
    background-color: var(--red-key-color);
    color: #fff;
}

.detail > .type-black {
    background-color: var(--black-key-color);
    color: #fff;
}
.detail > .type-etc {
    background-color: var(--etc-key-color);
    color : #fff;
}

.price {
    position: absolute;
    right: 0;
    font-size: 1.8rem
}


.review-list {
    padding: 0;
    list-style: none;
}

.review-item {
    position: relative;
    height: 8rem;
    border: 1px solid var(--border-color);
    border-radius: 1rem;
    margin-top: 3.5rem;
    display: flex;
    justify-content: space-between;
    border: 1px solid var(--border-color);
    border-radius: 1rem;
    padding: 1.0416666666666665%;
}


.review-item:first-child {
    margin-top: 1.75rem;
}

.review-item .btn-spread{
    position: absolute;
    right: -10%;
    background-color: #fff;
    border-style: none;
}

.review-item .btn-recplay {
    position: absolute;
    top : 50%;
    right: 5%;
    transform: translateY(-50%);
    width: 5rem;
    height: 5rem;
    border : 1px solid var(--border-color);
    border-radius: 100%;
    background-color: var(--accent-color);
}

/* .review-item .btn-recnone {
    border: 1px solid var(--border-color);
    background-color: var(--accent-color);
    border-radius: 50%;
} */

.writer, .summary {
    color: var(--font-color);
}

.writer {
    font-size: 1.4rem;
    border-bottom: 0.1rem solid var(--border-color);
}

.write-wrap {
    z-index: 0;
    background-color: var(--accent-color);
    position: absolute;
    top: 30%;
    left: 50%;
    transform: translateX(-50%);
    display: flex;
    flex-direction: column;
    padding: 1rem;
    border: 0.1rem solid var(--border-color);
    border-radius: 1rem;
    width:72.083333333333336%;
    height: 50%;
}

.write-wrap > textarea {
    color: var(--font-color);
    width: 100%;
    height: 100%;
    border-color: var(--border-color);
    border-radius: 1rem;
    overflow: auto;
    outline: none;
    -webkit-box-shadow: none;
    -moz-box-shadow: none;
    box-shadow: none;
    resize: none; /*remove the resize handle on the bottom right*/
}

.rating-wrap {
    color: #fff;
    display: inline-block;
    width: 15rem;
}

.btn-mic {
    width:5rem;
    height: 5rem;
    border-style: none;
    border-radius: 50%;
    background-color: var(--accent-color);
}

.interactive, .article-button {
    margin-right: 1rem;
    display: flex;
    justify-content: flex-end;
    align-items: center;
}

.article-button > button {
    margin-right: 1.2rem;
}

.interactive, textarea {
    margin-bottom: 1rem;
}

.write, .cancel, .registry {
    padding: 0.4rem 1.2rem;
    border: 0.1rem solid var(--border-color);
    border-radius: 1rem;
    color: #fff;
    background-color: var(--icon-color);
}

.summary {
    position: relative;
    font-size: 1.2rem;
}
</style>