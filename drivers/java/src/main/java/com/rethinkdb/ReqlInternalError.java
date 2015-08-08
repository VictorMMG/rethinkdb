// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../templates/Exception.java
package com.rethinkdb;

import java.util.Optional;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.response.Backtrace;

public class ReqlInternalError extends ReqlRuntimeError {

    Optional<Backtrace> backtrace = Optional.empty();
    Optional<ReqlAst> term = Optional.empty();

    public ReqlInternalError() {
    }

    public ReqlInternalError(String message) {
        super(message);
    }

    public ReqlInternalError(String format, Object... args) {
        super(String.format(format, args));
    }

    public ReqlInternalError(String message, Throwable cause) {
        super(message, cause);
    }

    public ReqlInternalError(Throwable cause) {
        super(cause);
    }

    public ReqlInternalError(String msg, ReqlAst term, Backtrace bt) {
        super(msg);
        this.backtrace = Optional.ofNullable(bt);
        this.term = Optional.ofNullable(term);
    }

    public ReqlInternalError setBacktrace(Backtrace backtrace) {
        this.backtrace = Optional.ofNullable(backtrace);
        return this;
    }

    public Optional<Backtrace> getBacktrace() {
        return backtrace;
    }

    public ReqlInternalError setTerm(ReqlAst term) {
        this.term = Optional.ofNullable(term);
        return this;
    }

    public Optional<ReqlAst> getTerm() {
        return this.term;
    }
}
