<template>
    <main>
        <div class="category">
            <strong>Category</strong>
        </div>
        <ol class="company-list">
            <li class="item">
                <a href="#">
                    <img src="../assets/img/abko.jpeg" alt="leopold">
                    <div class="company">
                        <div class="company-name">
                            <h2>ABKO</h2>
                        </div>
                    </div>
                </a>
            </li>
        </ol>
    </main>
</template>

<script>
export default {

}
</script>

<style scope>
main {
    overflow-y: scroll;
    width: 90%;
    margin: 0 3.5416666666666665%;
    height: 64rem;
}

main::-webkit-scrollbar {
    display: none;
}

.category {
    color: var(--main-color);
    font-size: 1.8rem;
    margin-top: 1rem;
    margin-bottom: 0.5rem;
}

.company-list {
    margin: 0;
    padding: 0;
    list-style: none;
    border-top: 1px solid var(--border-color);
}

.item:first-child {
    margin-top: 1.75rem;
}

.item {
    height: 8rem;
    border: 1px solid var(--border-color);
    border-radius: 1rem;
    margin-top: 3.5rem;
}

.item > a {
    position: relative;
    color: var(--font-color);
    display: flex;
    align-items: flex-end;
}

.item img {
    border: 1px solid var(--border-color);
    margin: 0.6rem;
    width: 6.4rem;
    height: 6.4rem;
    border-radius: 50%;
}

.company-name {
    color: var(--icon-color);
    position: absolute;
    bottom: 0;
    right: 5%;
}
</style>