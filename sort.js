const sortByCode = (arr) => {
    arr.sort((a, b) => a.code - b.code)
}

arr = [
    {
        "name":"test 10",
        "country":"USA",
        "code":12
    },
    {
        "name":"test 10",
        "country":"USA",
        "code":1
    },
    {
        "name":"test 10",
        "country":"USA",
        "code":44
    },
    {
        "name":"test 4",
        "country":"NIGERIA",
        "code":200
    },
]
sortByCode(arr)
console.log(arr)