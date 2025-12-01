// 函数: _ZN12ascension_ai31AIHandlerThread_StartEvaluationEPN4core24COptionDecisionEvaluatorEPNS0_10CWorldBaseEPK13CStateMachineP17CGameStateOptions
// 地址: 0x17bcc0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r6 = *ascension_ai::g_pAIHandlerThread

if (r6 != 0)
    int32_t r0 = pthread_self()
    
    if (pthread_equal(*(r6 + 8), r0) == 0)
        CGameStateOptions* var_28_1 = arg4
        ascension_ai::AIHandlerThread::StartEvaluation(*ascension_ai::g_pAIHandlerThread, arg1, 
            arg2, arg3)
        return 1

return 0
