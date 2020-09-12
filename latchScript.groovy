println("Latch script started.")
args[0].countDown()
args[0].await()
println("Latch script finished.")
