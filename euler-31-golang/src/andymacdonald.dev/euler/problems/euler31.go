package main

import "fmt"

var CoinValues = [8]int{1, 2, 5 ,10, 20, 50, 100, 200}
const TargetValue = 200

func main() {
	var solutionTable = [TargetValue + 1]int{}
	solutionTable[0] = 1
	for i := 0; i < len(CoinValues); i++ {
		for j := CoinValues[i]; j <= TargetValue; j++ {
			solutionTable[j] += solutionTable[j - CoinValues[i]]
		}
	}
	fmt.Println(solutionTable[TargetValue])
}
