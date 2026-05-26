/*
 * Copyright 2014 The FIX.io Project
 *
 * The FIX.io Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package fixio.fixprotocol.session;

public class SessionId {

    private final String senderCompID;

    private final String targetCompID;

    private final String senderSubID;

    private final String targetSubID;

    private final String senderLocationID;

    private final String targetLocationID;

    private final int hash;

    public SessionId(String senderCompID, String targetCompID, String senderSubID, String targetSubID, String senderLocationID, String targetLocationID) {
        assert (senderCompID != null) : "SenderCompID is required.";
        assert (targetCompID != null) : "TargetCompID is required.";
        this.senderCompID = senderCompID;
        this.targetCompID = targetCompID;
        this.senderSubID = senderSubID;
        this.targetSubID = targetSubID;
        this.senderLocationID = senderLocationID;
        this.targetLocationID = targetLocationID;
        //
        this.hash = calculateHash();
    }

    private static boolean idEquals(String s1, String s2) {
        return (s1 == null && s2 == null) || (s1 != null && s1.equals(s2));
    }

    public String getSenderCompID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getSenderSubID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getTargetCompID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getTargetSubID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getSenderLocationID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getTargetLocationID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private int calculateHash() {
        int result = senderCompID.hashCode();
        result = 31 * result + targetCompID.hashCode();
        if (senderSubID != null) {
            result = 31 * result + senderSubID.hashCode();
        }
        if (targetSubID != null) {
            result = 31 * result + targetSubID.hashCode();
        }
        if (senderLocationID != null) {
            result = 31 * result + senderLocationID.hashCode();
        }
        if (targetLocationID != null) {
            result = 31 * result + targetLocationID.hashCode();
        }
        return result;
    }
}
