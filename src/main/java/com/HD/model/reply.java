package com.HD.model;

import java.sql.Date;
import java.util.Objects;

/**
 * @@author vincent
 * @create2023-07-21-9:02
 */
public class reply {
    private int replyId;
    private String replyContent;
    private Date time;
    private int requestId;
    private int workerid;

    public reply(int replyId, String replyContent) {
        this.replyId = replyId;
        this.replyContent = replyContent;
    }

    @Override
    public String toString() {
        return "reply{" +
                "replyId=" + replyId +
                ", replyContent='" + replyContent + '\'' +
                ", time=" + time +
                ", requestId=" + requestId +
                ", workerid=" + workerid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        reply reply = (reply) o;
        return replyId == reply.replyId && requestId == reply.requestId && workerid == reply.workerid && Objects.equals(replyContent, reply.replyContent) && Objects.equals(time, reply.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replyId, replyContent, time, requestId, workerid);
    }

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getWorkerid() {
        return workerid;
    }

    public void setWorkerid(int workerid) {
        this.workerid = workerid;
    }

    public reply(int replyId, String replyContent, Date time, int requestId, int workerid) {
        this.replyId = replyId;
        this.replyContent = replyContent;
        this.time = time;
        this.requestId = requestId;
        this.workerid = workerid;
    }

    public reply() {
    }
}
