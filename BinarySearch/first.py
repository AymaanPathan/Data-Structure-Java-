def AddNumber(nums):
    newlist = []

    for i in range(len(nums)//2):
        sum_Pair = nums[i] + nums[-(i+1)]
        newlist.append(sum_Pair)

    newlist = list(set(newlist))
    newlist = tuple(newlist)

    return newlist

def main():
    n = int(input("Enter number oF Elements: "))
    nums = []
    print("Enter",n,"Elements")
    for i in range(n):
        num = int(input())
        nums.append(num)


    tuple_res = AddNumber(nums)
    print("Result Of  Tuple:", tuple_res)

main()
