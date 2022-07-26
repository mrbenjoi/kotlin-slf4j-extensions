/*
 * MIT License
 *
 * Copyright (c) 2017-2019, Hunter WB <hunterwb.com>
 * Copyright (c) 2022 mrbenjoi
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

@file:Suppress("NOTHING_TO_INLINE", "unused")

package adaptme.utils

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.lang.invoke.MethodHandles

/**
 * Calls [LoggerFactory.getLogger] with the [Class] that contains the call to this method.
 */
@JvmSynthetic
inline fun getLogger(): Logger {
    return LoggerFactory.getLogger(MethodHandles.lookup().lookupClass())
}

/**
 * Calls [LoggerFactory.getLogger].
 */
@JvmSynthetic
inline fun getLogger(clazz: Class<*>): Logger {
    return LoggerFactory.getLogger(clazz)
}

/**
 * Calls [LoggerFactory.getLogger].
 */
@JvmSynthetic
inline fun getLogger(name: String): Logger {
    return LoggerFactory.getLogger(name)
}

@JvmSynthetic
inline fun Logger.i(message: String) {
    this.info(message)
}

@JvmSynthetic
inline fun Logger.d(message: String) {
    this.debug(message)
}

@JvmSynthetic
inline fun Logger.t(message: String) {
    this.trace(message)
}

@JvmSynthetic
inline fun Logger.w(message: String) {
    this.warn(message)
}

@JvmSynthetic
inline fun Logger.e(message: String) {
    this.error(message)
}

@JvmSynthetic
inline fun Logger.i(computeMessage: () -> String) {
    if (this.isInfoEnabled) {
        this.info(computeMessage())
    }
}

@JvmSynthetic
inline fun Logger.d(computeMessage: () -> String) {
    if (this.isDebugEnabled) {
        this.debug(computeMessage())
    }
}

@JvmSynthetic
inline fun Logger.t(computeMessage: () -> String) {
    if (this.isTraceEnabled) {
        this.trace(computeMessage())
    }
}

@JvmSynthetic
inline fun Logger.w(computeMessage: () -> String) {
    if (this.isWarnEnabled) {
        this.warn(computeMessage())
    }
}

@JvmSynthetic
inline fun Logger.e(computeMessage: () -> String) {
    if (this.isErrorEnabled) {
        this.error(computeMessage())
    }
}

@JvmSynthetic
inline fun Logger.ifError(block: () -> Unit) {
    if (this.isErrorEnabled) {
        block()
    }
}

@JvmSynthetic
inline fun Logger.ifWarn(block: () -> Unit) {
    if (this.isWarnEnabled) {
        block()
    }
}

@JvmSynthetic
inline fun Logger.ifInfo(block: () -> Unit) {
    if (this.isInfoEnabled) {
        block()
    }
}

@JvmSynthetic
inline fun Logger.ifDebug(block: () -> Unit) {
    if (this.isDebugEnabled) {
        block()
    }
}

@JvmSynthetic
inline fun Logger.ifTrace(block: () -> Unit) {
    if (this.isTraceEnabled) {
        block()
    }
}
