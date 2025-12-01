// 函数: _ZN12ascension_ai30AIHandlerThread_StopEvaluationEv
// 地址: 0x17bb40
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
uint32_t r5 = *ascension_ai::g_pAIHandlerThread

if (r5 == 0)
    return ascension_ai::g_pAIHandlerThread

pthread_mutex_lock(r5 + 0x24)

if (zx.d(*(r5 + 0x40)) != 0)
    (*(**(r5 + 0x30) + 0xc))()
    __builtin_memset(r5 + 0x30, 0, 0x12)
    *(r5 + 0x44) = 0xffffffff
    *(r5 + 0x48) = 0

return pthread_mutex_unlock(r5 + 0x24) __tailcall
