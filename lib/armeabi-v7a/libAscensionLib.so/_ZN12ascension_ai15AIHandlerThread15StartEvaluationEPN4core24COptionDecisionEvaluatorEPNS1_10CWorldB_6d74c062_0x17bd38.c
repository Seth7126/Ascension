// 函数: _ZN12ascension_ai15AIHandlerThread15StartEvaluationEPN4core24COptionDecisionEvaluatorEPNS1_10CWorldBaseEPK13CStateMachineP17CGameStateOptions
// 地址: 0x17bd38
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

pthread_mutex_lock(arg1 + 0x24)

if (zx.d(*(arg1 + 0x40)) == 0)
    goto label_17bdb4

int32_t* r0_2 = *(arg1 + 0x30)

if (r0_2 != arg2)
    (*(*r0_2 + 0xc))()
    __builtin_memset(arg1 + 0x30, 0, 0x12)
    *(arg1 + 0x44) = 0xffffffff
    *(arg1 + 0x48) = 0
label_17bdb4:
    *(arg1 + 0x30) = arg2
    *(arg1 + 0x34) = arg3
    *(arg1 + 0x38) = arg4
    int32_t arg_0
    *(arg1 + 0x3c) = arg_0
    *(arg1 + 0x40) = 1
    *(arg1 + 0x44) = 0xffffffff
    *(arg1 + 0x48) = 0
    int32_t r0_3 = pthread_self(0xffffffff, 0)
    
    if (pthread_equal(*(arg1 + 8), r0_3) == 0 && pthread_mutex_trylock(arg1 + 0x28) == 0)
        pthread_cond_signal(arg1 + 0x2c)
        pthread_mutex_unlock(arg1 + 0x28)

return pthread_mutex_unlock(arg1 + 0x24) __tailcall
