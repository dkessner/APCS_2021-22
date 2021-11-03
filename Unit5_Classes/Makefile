#
# Makefile
#

# $* stem of implicit rule match 
# $@ target 
# $< first prerequisite


pdf_targets = $(patsubst %.md,%.pdf,$(wildcard *Quiz*.md))

html_targets = $(patsubst %.md,%.html,$(wildcard *.md))

targets = $(pdf_targets) 

all: $(targets)
	@echo Targets: $(targets)

# --mathjax: currently uses MathJax CDN for rendering
# -s: standalone (use full HTML template)

%.html: %.md
	pandoc $< -o $@ -t html5 -s --mathjax

%.pdf: %.md
	pandoc $< -o $@ 

clean:
	rm -f $(targets)


