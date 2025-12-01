package com.google.android.gms.games.leaderboard;

import android.util.SparseArray;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.games.zzfa;

public final class ScoreSubmissionData {
    public static final class Result {
        public final String formattedScore;
        public final boolean newBest;
        public final long rawScore;
        public final String scoreTag;

        public Result(long v, String s, String s1, boolean z) {
            this.rawScore = v;
            this.formattedScore = s;
            this.scoreTag = s1;
            this.newBest = z;
        }

        @Override
        public final String toString() {
            return Objects.toStringHelper(this).add("RawScore", this.rawScore).add("FormattedScore", this.formattedScore).add("ScoreTag", this.scoreTag).add("NewBest", Boolean.valueOf(this.newBest)).toString();
        }
    }

    private int statusCode;
    private String zzba;
    private String zzjs;
    private static final String[] zzku;
    private SparseArray zzkv;

    static {
        ScoreSubmissionData.zzku = new String[]{"leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag"};
    }

    public ScoreSubmissionData(DataHolder dataHolder0) {
        this.statusCode = dataHolder0.getStatusCode();
        this.zzkv = new SparseArray();
        int v = dataHolder0.getCount();
        Preconditions.checkArgument(v == 3);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = dataHolder0.getWindowIndex(v1);
            if(v1 == 0) {
                this.zzjs = dataHolder0.getString("leaderboardId", 0, v2);
                this.zzba = dataHolder0.getString("playerId", 0, v2);
            }
            if(dataHolder0.getBoolean("hasResult", v1, v2)) {
                Result scoreSubmissionData$Result0 = new Result(dataHolder0.getLong("rawScore", v1, v2), dataHolder0.getString("formattedScore", v1, v2), dataHolder0.getString("scoreTag", v1, v2), dataHolder0.getBoolean("newBest", v1, v2));
                int v3 = dataHolder0.getInteger("timeSpan", v1, v2);
                this.zzkv.put(v3, scoreSubmissionData$Result0);
            }
        }
    }

    public final String getLeaderboardId() {
        return this.zzjs;
    }

    public final String getPlayerId() {
        return this.zzba;
    }

    public final Result getScoreResult(int v) {
        return (Result)this.zzkv.get(v);
    }

    @Override
    public final String toString() {
        ToStringHelper objects$ToStringHelper0 = Objects.toStringHelper(this).add("PlayerId", this.zzba).add("StatusCode", this.statusCode);
        for(int v = 0; v < 3; ++v) {
            Result scoreSubmissionData$Result0 = (Result)this.zzkv.get(v);
            objects$ToStringHelper0.add("TimesSpan", zzfa.zzo(v));
            objects$ToStringHelper0.add("Result", (scoreSubmissionData$Result0 == null ? "null" : scoreSubmissionData$Result0.toString()));
        }
        return objects$ToStringHelper0.toString();
    }
}

