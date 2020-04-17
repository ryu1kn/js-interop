
out/main.js: $(wildcard src/**/*.cljs) $(wildcard *.edn)
	clj -m cljs.main -co build.edn -c

.PHONY: run
run: out/main.js
	node $<
