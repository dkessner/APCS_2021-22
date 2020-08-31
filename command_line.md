
<h1>Command line</h1>

<p> Using the command line lets you harness the full power of your computer.
&nbsp; This page contains an outline of concepts that you should become
familiar with.  &nbsp; However, it is not a comprehensive description of any of
them, and you should look up any concept that you are unsure about.  </p>

<p> When you are first using the command line, it will feel awkward and it may
seem difficult to get things done. &nbsp;  You will forget the command names
and the required arguments and flags, and you may have to look up the same
command several times before you internalize its usage.  &nbsp;  However, with
just a little practice, you will become much faster at using the command line
than you are at clicking buttons. &nbsp; You will also be able to do things
that you can't do through the standard graphical user interface.</p>

<h2>Accessing the command line</h2>

<p> In OSX, you can access the command line through the Terminal application,
which provides access to a command line shell called <code>bash</code>. &nbsp;
Because OSX is a descendant of BSD Unix, you can use all the standard Unix
commands in Terminal.  &nbsp; In the following, we use "Unix" as a generic term
that includes OSX and Linux. </p>

<p> On Windows, the command line interpreter is called <code>cmd</code> or
Command Line.  &nbsp; The <code>cmd</code> commands are based on the old DOS
commands and provide similar functionality to the Unix commands </p>


<h2>Basic commands</h2>

<p> You should familiarize yourself with these commands.  You can find an
abundance of tutorials online about the command line, as well as reference
pages for each command.
</p> <br/>
 

<table>
    <tr>
        <th>Unix Command <br/> (including OSX, Linux)</th>
        <th>Windows Command</th>
        <th>Function</th>
    </tr>
    <tr>
        <td>ls</td>
        <td>dir</td>
        <td>list files in directory</td>
    </tr>
    <tr>
        <td>cd</td>
        <td>cd</td>
        <td>change directory</td>
    </tr>
    <tr>
        <td>cat</td>
        <td>type</td>
        <td>print contents of file to console</td>
    </tr>
    <tr>
        <td>mv</td>
        <td>move</td>
        <td>move file or directory</td>
    </tr>
    <tr>
        <td>cp</td>
        <td>copy</td>
        <td>copy file or directory</td>
    </tr>
    <tr>
        <td>mkdir</td>
        <td>md</td>
        <td>make directory</td>
    </tr>
    <tr>
        <td>rm / rmdir</td>
        <td>del / rmdir</td>
        <td>remove/delete file or directory</td>
    </tr>
    <tr>
        <td>which</td>
        <td>where</td>
        <td>find full path to specified command</td>
    </tr>
    <tr>
        <td>pwd</td>
        <td>cd</td>
        <td>print current (working) directory</td>
    </tr>
</table>


<h2>Miscellaneous notes</h2>

<h3>Current directory</h3>

<p> When working on the command line (in both Unix and Windows) you need to be
aware of your <em>current directory</em> (sometimes called <em>working
directory</em>). &nbsp; When you start up the command line shell, you begin in your
<em>home directory</em>, i.e. your current directory starts out as your home
directory. &nbsp; On both Unix and Windows, <code>.</code> (dot) refers to the
current directory, and <code>..</code> (dot dot) refers to the directory one
level back. &nbsp; On Unix systems, you can refer to your home directory with the
<code>~</code> (tilde) symbol, and you can jump directly back to your home
directory by using <code>cd</code> with no additional arguments.

<h3>File paths</h3>

<p> On Unix, directories in file paths are separated by a forward slash
(<code>/</code>): <pre><code class="language-bash">~/temp/hello </code></pre>
On Windows, directories in file paths are separated by a backslash
(<code>\</code>): <pre><code class="language-bash">C:\Users\kessnerd\temp\hello
</code></pre> </p>

<h3>Wildcards</h3>

<p>On both Unix and Windows, you can use <code>*</code> (star) as a wildcard
that will match any string, e.g. <code>*.txt</code> means "all files with
extension <code>.txt</code>".</p>

<h3>PATH</h3> <p>Both Unix and Windows use environment variables, and in
particular an environment variabled called <code>PATH</code>, which contains a
list of diretories.  &nbsp; When the user types in a command, the operating
system goes through each directory in the list, searching for the command
executable, and running the executable when it finds it.</p> <p>If you write a
command line program and want to be able to run it from any directory, you must
put the executable in a directory that is in the <code>PATH</code>.  </p>

<h3>Scripting</h3> <p>A <em>script</em> is just another name for a program that
is run through an interpreter. &nbsp; Command line scripts are run by the
command line interpreter. &nbsp; A script can be as simple as a few commands.
On the other hand, scripts on Unix (bash scripts) or Windows (batch
files) can also use standard programming constructs such as variables,
conditionals, loops, and functions. &nbsp; Note however that while these
programming constructs are available, they are not as easy to use as in a more
polished programming language like Python or C/C++/Java.  </p>



