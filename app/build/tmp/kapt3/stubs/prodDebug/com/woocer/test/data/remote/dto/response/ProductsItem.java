package com.woocer.test.data.remote.dto.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0003\b\u00b5\u0001\b\u0086\b\u0018\u00002\u00020\u0001B\u00eb\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\t\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\u0006\u0010#\u001a\u00020\t\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010%\u001a\u00020\u001e\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u0005\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0005\u0012\u0006\u0010*\u001a\u00020\t\u0012\u0006\u0010+\u001a\u00020\u001e\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0005\u0012\u0006\u0010.\u001a\u00020\u0007\u0012\u0006\u0010/\u001a\u00020\t\u0012\u0006\u00100\u001a\u00020\u001e\u0012\u0006\u00101\u001a\u00020\u0007\u0012\u0006\u00102\u001a\u00020\u0007\u0012\u0006\u00103\u001a\u00020\u0007\u0012\u0006\u00104\u001a\u00020\t\u0012\u0006\u00105\u001a\u00020\u0007\u0012\u0006\u00106\u001a\u00020\u001e\u0012\u0006\u00107\u001a\u00020\u0007\u0012\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005\u0012\u0006\u00109\u001a\u00020\t\u0012\u0006\u0010:\u001a\u00020\u0007\u0012\u0006\u0010;\u001a\u00020\u0007\u0012\u0006\u0010<\u001a\u00020\u001e\u0012\u0006\u0010=\u001a\u00020\t\u0012\u0006\u0010>\u001a\u00020\t\u0012\u0006\u0010?\u001a\u00020\u0007\u0012\u0006\u0010@\u001a\u00020\u0007\u0012\u0006\u0010A\u001a\u00020\u0007\u0012\u0006\u0010B\u001a\u00020\t\u0012\u0006\u0010C\u001a\u00020\u0007\u0012\u0006\u0010D\u001a\u00020\u001e\u0012\u0006\u0010E\u001a\u00020\u0007\u0012\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010G\u001a\u00020\u0007\u0012\u0006\u0010H\u001a\u00020\u0007\u0012\u0006\u0010I\u001a\u00020\u001e\u0012\u0006\u0010J\u001a\u00020\u0007\u0012\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010M\u001a\u00020\t\u0012\u0006\u0010N\u001a\u00020\u0007\u00a2\u0006\u0002\u0010OJ\n\u0010\u009a\u0001\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00a0\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00a1\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00a2\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00a3\u0001\u001a\u00020\u0001H\u00c6\u0003J\u0010\u0010\u00a4\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J\u0010\u0010\u00a5\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J\n\u0010\u00a6\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00a7\u0001\u001a\u00020\u001cH\u00c6\u0003J\n\u0010\u00a8\u0001\u001a\u00020\u001eH\u00c6\u0003J\n\u0010\u00a9\u0001\u001a\u00020\u001eH\u00c6\u0003J\n\u0010\u00aa\u0001\u001a\u00020\tH\u00c6\u0003J\u0010\u0010\u00ab\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J\n\u0010\u00ac\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00ad\u0001\u001a\u00020\tH\u00c6\u0003J\u0010\u0010\u00ae\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J\n\u0010\u00af\u0001\u001a\u00020\u001eH\u00c6\u0003J\n\u0010\u00b0\u0001\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010\u00b1\u0001\u001a\b\u0012\u0004\u0012\u00020\'0\u0005H\u00c6\u0003J\u0010\u0010\u00b2\u0001\u001a\b\u0012\u0004\u0012\u00020)0\u0005H\u00c6\u0003J\n\u0010\u00b3\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00b4\u0001\u001a\u00020\u001eH\u00c6\u0003J\u0010\u0010\u00b5\u0001\u001a\b\u0012\u0004\u0012\u00020-0\u0005H\u00c6\u0003J\n\u0010\u00b6\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00b7\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00b8\u0001\u001a\u00020\u001eH\u00c6\u0003J\n\u0010\u00b9\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00ba\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00bb\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00bc\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00bd\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00be\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00bf\u0001\u001a\u00020\u001eH\u00c6\u0003J\n\u0010\u00c0\u0001\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010\u00c1\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005H\u00c6\u0003J\n\u0010\u00c2\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00c3\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00c4\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00c5\u0001\u001a\u00020\u001eH\u00c6\u0003J\n\u0010\u00c6\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00c7\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00c8\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00c9\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00ca\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00cb\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00cc\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00cd\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00ce\u0001\u001a\u00020\u001eH\u00c6\u0003J\n\u0010\u00cf\u0001\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010\u00d0\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J\n\u0010\u00d1\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00d2\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00d3\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00d4\u0001\u001a\u00020\u001eH\u00c6\u0003J\n\u0010\u00d5\u0001\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010\u00d6\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J\u0010\u0010\u00d7\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J\n\u0010\u00d8\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00d9\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00da\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00db\u0001\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010\u00dc\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005H\u00c6\u0003J\u00f6\u0005\u0010\u00dd\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\t2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\t2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010%\u001a\u00020\u001e2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u00052\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00052\b\b\u0002\u0010*\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020\u001e2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00052\b\b\u0002\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\t2\b\b\u0002\u00100\u001a\u00020\u001e2\b\b\u0002\u00101\u001a\u00020\u00072\b\b\u0002\u00102\u001a\u00020\u00072\b\b\u0002\u00103\u001a\u00020\u00072\b\b\u0002\u00104\u001a\u00020\t2\b\b\u0002\u00105\u001a\u00020\u00072\b\b\u0002\u00106\u001a\u00020\u001e2\b\b\u0002\u00107\u001a\u00020\u00072\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00052\b\b\u0002\u00109\u001a\u00020\t2\b\b\u0002\u0010:\u001a\u00020\u00072\b\b\u0002\u0010;\u001a\u00020\u00072\b\b\u0002\u0010<\u001a\u00020\u001e2\b\b\u0002\u0010=\u001a\u00020\t2\b\b\u0002\u0010>\u001a\u00020\t2\b\b\u0002\u0010?\u001a\u00020\u00072\b\b\u0002\u0010@\u001a\u00020\u00072\b\b\u0002\u0010A\u001a\u00020\u00072\b\b\u0002\u0010B\u001a\u00020\t2\b\b\u0002\u0010C\u001a\u00020\u00072\b\b\u0002\u0010D\u001a\u00020\u001e2\b\b\u0002\u0010E\u001a\u00020\u00072\u000e\b\u0002\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010G\u001a\u00020\u00072\b\b\u0002\u0010H\u001a\u00020\u00072\b\b\u0002\u0010I\u001a\u00020\u001e2\b\b\u0002\u0010J\u001a\u00020\u00072\u000e\b\u0002\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010M\u001a\u00020\t2\b\b\u0002\u0010N\u001a\u00020\u0007H\u00c6\u0001J\u0015\u0010\u00de\u0001\u001a\u00020\t2\t\u0010\u00df\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00e0\u0001\u001a\u00020\u001eH\u00d6\u0001J\n\u0010\u00e1\u0001\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010UR\u0011\u0010\u000b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010WR\u0011\u0010\f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010UR\u0011\u0010\r\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010UR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010SR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010SR\u0011\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010UR\u0011\u0010\u0012\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010UR\u0011\u0010\u0013\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010UR\u0011\u0010\u0014\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010UR\u0011\u0010\u0015\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u0011\u0010\u0016\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010cR\u0011\u0010\u0017\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010cR\u0011\u0010\u0018\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010cR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010SR\u0011\u0010\u001a\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010UR\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0011\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u0011\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010lR\u0011\u0010 \u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010WR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010SR\u0011\u0010\"\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010UR\u0011\u0010#\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010WR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010SR\u0011\u0010%\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010lR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bt\u0010SR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bu\u0010SR\u0011\u0010*\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bv\u0010WR\u0011\u0010+\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bw\u0010lR\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bx\u0010SR\u0011\u0010.\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\by\u0010UR\u0011\u0010/\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bz\u0010WR\u0011\u00100\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b{\u0010lR\u0011\u00101\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b|\u0010UR\u0011\u00102\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b}\u0010UR\u0011\u00103\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b~\u0010UR\u0011\u00104\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010WR\u0012\u00105\u001a\u00020\u0007\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010UR\u0012\u00106\u001a\u00020\u001e\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010lR\u0012\u00107\u001a\u00020\u0007\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010UR\u0018\u00108\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010SR\u0012\u00109\u001a\u00020\t\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010WR\u0012\u0010:\u001a\u00020\u0007\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010UR\u0012\u0010;\u001a\u00020\u0007\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010UR\u0012\u0010<\u001a\u00020\u001e\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010lR\u0012\u0010=\u001a\u00020\t\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010WR\u0012\u0010>\u001a\u00020\t\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010WR\u0012\u0010?\u001a\u00020\u0007\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010UR\u0012\u0010@\u001a\u00020\u0007\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010UR\u0012\u0010A\u001a\u00020\u0007\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010UR\u0012\u0010B\u001a\u00020\t\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010WR\u0012\u0010C\u001a\u00020\u0007\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010UR\u0012\u0010D\u001a\u00020\u001e\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010lR\u0012\u0010E\u001a\u00020\u0007\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010UR\u0018\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010SR\u0012\u0010G\u001a\u00020\u0007\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010UR\u0012\u0010H\u001a\u00020\u0007\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010UR\u0012\u0010I\u001a\u00020\u001e\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010lR\u0012\u0010J\u001a\u00020\u0007\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010UR\u0018\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010SR\u0018\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010SR\u0012\u0010M\u001a\u00020\t\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010WR\u0012\u0010N\u001a\u00020\u0007\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010U\u00a8\u0006\u00e2\u0001"}, d2 = {"Lcom/woocer/test/data/remote/dto/response/ProductsItem;", "", "_links", "Lcom/woocer/test/data/remote/dto/response/Links;", "attributes", "", "average_rating", "", "backordered", "", "backorders", "backorders_allowed", "button_text", "catalog_visibility", "categories", "Lcom/woocer/test/data/remote/dto/response/Category;", "cross_sell_ids", "date_created", "date_created_gmt", "date_modified", "date_modified_gmt", "date_on_sale_from", "date_on_sale_from_gmt", "date_on_sale_to", "date_on_sale_to_gmt", "default_attributes", "description", "dimensions", "Lcom/woocer/test/data/remote/dto/response/Dimensions;", "download_expiry", "", "download_limit", "downloadable", "downloads", "external_url", "featured", "grouped_products", "id", "images", "Lcom/woocer/test/data/remote/dto/response/Image;", "jetpackrelatedposts", "Lcom/woocer/test/data/remote/dto/response/JetpackRelatedPost;", "manage_stock", "menu_order", "meta_data", "Lcom/woocer/test/data/remote/dto/response/MetaData;", "name", "on_sale", "parent_id", "permalink", "price", "price_html", "purchasable", "purchase_note", "rating_count", "regular_price", "related_ids", "reviews_allowed", "sale_price", "shipping_class", "shipping_class_id", "shipping_required", "shipping_taxable", "short_description", "sku", "slug", "sold_individually", "status", "stock_quantity", "stock_status", "tags", "tax_class", "tax_status", "total_sales", "type", "upsell_ids", "variations", "virtual", "weight", "(Lcom/woocer/test/data/remote/dto/response/Links;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Lcom/woocer/test/data/remote/dto/response/Dimensions;IIZLjava/util/List;Ljava/lang/String;ZLjava/util/List;ILjava/util/List;Ljava/util/List;ZILjava/util/List;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;IZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)V", "get_links", "()Lcom/woocer/test/data/remote/dto/response/Links;", "getAttributes", "()Ljava/util/List;", "getAverage_rating", "()Ljava/lang/String;", "getBackordered", "()Z", "getBackorders", "getBackorders_allowed", "getButton_text", "getCatalog_visibility", "getCategories", "getCross_sell_ids", "getDate_created", "getDate_created_gmt", "getDate_modified", "getDate_modified_gmt", "getDate_on_sale_from", "()Ljava/lang/Object;", "getDate_on_sale_from_gmt", "getDate_on_sale_to", "getDate_on_sale_to_gmt", "getDefault_attributes", "getDescription", "getDimensions", "()Lcom/woocer/test/data/remote/dto/response/Dimensions;", "getDownload_expiry", "()I", "getDownload_limit", "getDownloadable", "getDownloads", "getExternal_url", "getFeatured", "getGrouped_products", "getId", "getImages", "getJetpackrelatedposts", "getManage_stock", "getMenu_order", "getMeta_data", "getName", "getOn_sale", "getParent_id", "getPermalink", "getPrice", "getPrice_html", "getPurchasable", "getPurchase_note", "getRating_count", "getRegular_price", "getRelated_ids", "getReviews_allowed", "getSale_price", "getShipping_class", "getShipping_class_id", "getShipping_required", "getShipping_taxable", "getShort_description", "getSku", "getSlug", "getSold_individually", "getStatus", "getStock_quantity", "getStock_status", "getTags", "getTax_class", "getTax_status", "getTotal_sales", "getType", "getUpsell_ids", "getVariations", "getVirtual", "getWeight", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_prodDebug"})
public final class ProductsItem {
    @org.jetbrains.annotations.NotNull()
    private final com.woocer.test.data.remote.dto.response.Links _links = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> attributes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String average_rating = null;
    private final boolean backordered = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String backorders = null;
    private final boolean backorders_allowed = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String button_text = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String catalog_visibility = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.woocer.test.data.remote.dto.response.Category> categories = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> cross_sell_ids = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_created = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_created_gmt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_modified = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date_modified_gmt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object date_on_sale_from = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object date_on_sale_from_gmt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object date_on_sale_to = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object date_on_sale_to_gmt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> default_attributes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocer.test.data.remote.dto.response.Dimensions dimensions = null;
    private final int download_expiry = 0;
    private final int download_limit = 0;
    private final boolean downloadable = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> downloads = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String external_url = null;
    private final boolean featured = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> grouped_products = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.woocer.test.data.remote.dto.response.Image> images = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.woocer.test.data.remote.dto.response.JetpackRelatedPost> jetpackrelatedposts = null;
    private final boolean manage_stock = false;
    private final int menu_order = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.woocer.test.data.remote.dto.response.MetaData> meta_data = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final boolean on_sale = false;
    private final int parent_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String permalink = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String price = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String price_html = null;
    private final boolean purchasable = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String purchase_note = null;
    private final int rating_count = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String regular_price = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Integer> related_ids = null;
    private final boolean reviews_allowed = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sale_price = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String shipping_class = null;
    private final int shipping_class_id = 0;
    private final boolean shipping_required = false;
    private final boolean shipping_taxable = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String short_description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sku = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String slug = null;
    private final boolean sold_individually = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    private final int stock_quantity = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String stock_status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> tags = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String tax_class = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String tax_status = null;
    private final int total_sales = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> upsell_ids = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> variations = null;
    private final boolean virtual = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String weight = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocer.test.data.remote.dto.response.ProductsItem copy(@org.jetbrains.annotations.NotNull()
    com.woocer.test.data.remote.dto.response.Links _links, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> attributes, @org.jetbrains.annotations.NotNull()
    java.lang.String average_rating, boolean backordered, @org.jetbrains.annotations.NotNull()
    java.lang.String backorders, boolean backorders_allowed, @org.jetbrains.annotations.NotNull()
    java.lang.String button_text, @org.jetbrains.annotations.NotNull()
    java.lang.String catalog_visibility, @org.jetbrains.annotations.NotNull()
    java.util.List<com.woocer.test.data.remote.dto.response.Category> categories, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> cross_sell_ids, @org.jetbrains.annotations.NotNull()
    java.lang.String date_created, @org.jetbrains.annotations.NotNull()
    java.lang.String date_created_gmt, @org.jetbrains.annotations.NotNull()
    java.lang.String date_modified, @org.jetbrains.annotations.NotNull()
    java.lang.String date_modified_gmt, @org.jetbrains.annotations.NotNull()
    java.lang.Object date_on_sale_from, @org.jetbrains.annotations.NotNull()
    java.lang.Object date_on_sale_from_gmt, @org.jetbrains.annotations.NotNull()
    java.lang.Object date_on_sale_to, @org.jetbrains.annotations.NotNull()
    java.lang.Object date_on_sale_to_gmt, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> default_attributes, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    com.woocer.test.data.remote.dto.response.Dimensions dimensions, int download_expiry, int download_limit, boolean downloadable, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> downloads, @org.jetbrains.annotations.NotNull()
    java.lang.String external_url, boolean featured, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> grouped_products, int id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.woocer.test.data.remote.dto.response.Image> images, @org.jetbrains.annotations.NotNull()
    java.util.List<com.woocer.test.data.remote.dto.response.JetpackRelatedPost> jetpackrelatedposts, boolean manage_stock, int menu_order, @org.jetbrains.annotations.NotNull()
    java.util.List<com.woocer.test.data.remote.dto.response.MetaData> meta_data, @org.jetbrains.annotations.NotNull()
    java.lang.String name, boolean on_sale, int parent_id, @org.jetbrains.annotations.NotNull()
    java.lang.String permalink, @org.jetbrains.annotations.NotNull()
    java.lang.String price, @org.jetbrains.annotations.NotNull()
    java.lang.String price_html, boolean purchasable, @org.jetbrains.annotations.NotNull()
    java.lang.String purchase_note, int rating_count, @org.jetbrains.annotations.NotNull()
    java.lang.String regular_price, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> related_ids, boolean reviews_allowed, @org.jetbrains.annotations.NotNull()
    java.lang.String sale_price, @org.jetbrains.annotations.NotNull()
    java.lang.String shipping_class, int shipping_class_id, boolean shipping_required, boolean shipping_taxable, @org.jetbrains.annotations.NotNull()
    java.lang.String short_description, @org.jetbrains.annotations.NotNull()
    java.lang.String sku, @org.jetbrains.annotations.NotNull()
    java.lang.String slug, boolean sold_individually, @org.jetbrains.annotations.NotNull()
    java.lang.String status, int stock_quantity, @org.jetbrains.annotations.NotNull()
    java.lang.String stock_status, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> tags, @org.jetbrains.annotations.NotNull()
    java.lang.String tax_class, @org.jetbrains.annotations.NotNull()
    java.lang.String tax_status, int total_sales, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> upsell_ids, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> variations, boolean virtual, @org.jetbrains.annotations.NotNull()
    java.lang.String weight) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ProductsItem(@org.jetbrains.annotations.NotNull()
    com.woocer.test.data.remote.dto.response.Links _links, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> attributes, @org.jetbrains.annotations.NotNull()
    java.lang.String average_rating, boolean backordered, @org.jetbrains.annotations.NotNull()
    java.lang.String backorders, boolean backorders_allowed, @org.jetbrains.annotations.NotNull()
    java.lang.String button_text, @org.jetbrains.annotations.NotNull()
    java.lang.String catalog_visibility, @org.jetbrains.annotations.NotNull()
    java.util.List<com.woocer.test.data.remote.dto.response.Category> categories, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> cross_sell_ids, @org.jetbrains.annotations.NotNull()
    java.lang.String date_created, @org.jetbrains.annotations.NotNull()
    java.lang.String date_created_gmt, @org.jetbrains.annotations.NotNull()
    java.lang.String date_modified, @org.jetbrains.annotations.NotNull()
    java.lang.String date_modified_gmt, @org.jetbrains.annotations.NotNull()
    java.lang.Object date_on_sale_from, @org.jetbrains.annotations.NotNull()
    java.lang.Object date_on_sale_from_gmt, @org.jetbrains.annotations.NotNull()
    java.lang.Object date_on_sale_to, @org.jetbrains.annotations.NotNull()
    java.lang.Object date_on_sale_to_gmt, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> default_attributes, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    com.woocer.test.data.remote.dto.response.Dimensions dimensions, int download_expiry, int download_limit, boolean downloadable, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> downloads, @org.jetbrains.annotations.NotNull()
    java.lang.String external_url, boolean featured, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> grouped_products, int id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.woocer.test.data.remote.dto.response.Image> images, @org.jetbrains.annotations.NotNull()
    java.util.List<com.woocer.test.data.remote.dto.response.JetpackRelatedPost> jetpackrelatedposts, boolean manage_stock, int menu_order, @org.jetbrains.annotations.NotNull()
    java.util.List<com.woocer.test.data.remote.dto.response.MetaData> meta_data, @org.jetbrains.annotations.NotNull()
    java.lang.String name, boolean on_sale, int parent_id, @org.jetbrains.annotations.NotNull()
    java.lang.String permalink, @org.jetbrains.annotations.NotNull()
    java.lang.String price, @org.jetbrains.annotations.NotNull()
    java.lang.String price_html, boolean purchasable, @org.jetbrains.annotations.NotNull()
    java.lang.String purchase_note, int rating_count, @org.jetbrains.annotations.NotNull()
    java.lang.String regular_price, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> related_ids, boolean reviews_allowed, @org.jetbrains.annotations.NotNull()
    java.lang.String sale_price, @org.jetbrains.annotations.NotNull()
    java.lang.String shipping_class, int shipping_class_id, boolean shipping_required, boolean shipping_taxable, @org.jetbrains.annotations.NotNull()
    java.lang.String short_description, @org.jetbrains.annotations.NotNull()
    java.lang.String sku, @org.jetbrains.annotations.NotNull()
    java.lang.String slug, boolean sold_individually, @org.jetbrains.annotations.NotNull()
    java.lang.String status, int stock_quantity, @org.jetbrains.annotations.NotNull()
    java.lang.String stock_status, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> tags, @org.jetbrains.annotations.NotNull()
    java.lang.String tax_class, @org.jetbrains.annotations.NotNull()
    java.lang.String tax_status, int total_sales, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> upsell_ids, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> variations, boolean virtual, @org.jetbrains.annotations.NotNull()
    java.lang.String weight) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocer.test.data.remote.dto.response.Links component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocer.test.data.remote.dto.response.Links get_links() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getAttributes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAverage_rating() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getBackordered() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBackorders() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean getBackorders_allowed() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getButton_text() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCatalog_visibility() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocer.test.data.remote.dto.response.Category> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocer.test.data.remote.dto.response.Category> getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getCross_sell_ids() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_created() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_created_gmt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_modified() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate_modified_gmt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDate_on_sale_from() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDate_on_sale_from_gmt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDate_on_sale_to() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDate_on_sale_to_gmt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getDefault_attributes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocer.test.data.remote.dto.response.Dimensions component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocer.test.data.remote.dto.response.Dimensions getDimensions() {
        return null;
    }
    
    public final int component22() {
        return 0;
    }
    
    public final int getDownload_expiry() {
        return 0;
    }
    
    public final int component23() {
        return 0;
    }
    
    public final int getDownload_limit() {
        return 0;
    }
    
    public final boolean component24() {
        return false;
    }
    
    public final boolean getDownloadable() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getDownloads() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExternal_url() {
        return null;
    }
    
    public final boolean component27() {
        return false;
    }
    
    public final boolean getFeatured() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getGrouped_products() {
        return null;
    }
    
    public final int component29() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocer.test.data.remote.dto.response.Image> component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocer.test.data.remote.dto.response.Image> getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocer.test.data.remote.dto.response.JetpackRelatedPost> component31() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocer.test.data.remote.dto.response.JetpackRelatedPost> getJetpackrelatedposts() {
        return null;
    }
    
    public final boolean component32() {
        return false;
    }
    
    public final boolean getManage_stock() {
        return false;
    }
    
    public final int component33() {
        return 0;
    }
    
    public final int getMenu_order() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocer.test.data.remote.dto.response.MetaData> component34() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocer.test.data.remote.dto.response.MetaData> getMeta_data() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component35() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final boolean component36() {
        return false;
    }
    
    public final boolean getOn_sale() {
        return false;
    }
    
    public final int component37() {
        return 0;
    }
    
    public final int getParent_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component38() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPermalink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component39() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component40() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrice_html() {
        return null;
    }
    
    public final boolean component41() {
        return false;
    }
    
    public final boolean getPurchasable() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component42() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPurchase_note() {
        return null;
    }
    
    public final int component43() {
        return 0;
    }
    
    public final int getRating_count() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component44() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRegular_price() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component45() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getRelated_ids() {
        return null;
    }
    
    public final boolean component46() {
        return false;
    }
    
    public final boolean getReviews_allowed() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component47() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSale_price() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component48() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShipping_class() {
        return null;
    }
    
    public final int component49() {
        return 0;
    }
    
    public final int getShipping_class_id() {
        return 0;
    }
    
    public final boolean component50() {
        return false;
    }
    
    public final boolean getShipping_required() {
        return false;
    }
    
    public final boolean component51() {
        return false;
    }
    
    public final boolean getShipping_taxable() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component52() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShort_description() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component53() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSku() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component54() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSlug() {
        return null;
    }
    
    public final boolean component55() {
        return false;
    }
    
    public final boolean getSold_individually() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component56() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final int component57() {
        return 0;
    }
    
    public final int getStock_quantity() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component58() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStock_status() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component59() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component60() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTax_class() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component61() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTax_status() {
        return null;
    }
    
    public final int component62() {
        return 0;
    }
    
    public final int getTotal_sales() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component63() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component64() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getUpsell_ids() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component65() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getVariations() {
        return null;
    }
    
    public final boolean component66() {
        return false;
    }
    
    public final boolean getVirtual() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component67() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWeight() {
        return null;
    }
}