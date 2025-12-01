// 函数: _ZN26CReliableTCPConnectionIPV64SendEP18OutgoingTCPMessage
// 地址: 0xbbbf0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t result

if (zx.d(*(arg1 + 0x18)) == 0)
    result = 0
else
    time(arg1 + 0x824)
    result = 1
    int32_t* entry___buf
    
    if (send(*(arg1 + 4), entry___buf, *entry___buf + 4, 0) == 0xffffffff)
        puts("#### Network Send error!")
        socklen_t __optlen = 4
        int32_t __optval
        
        if (getsockopt(*(arg1 + 4), 1, 4, &__optval, &__optlen) == 0)
            printf("        error = %d\n", __optval)
        
        (*(*arg1 + 4))(arg1)
        result = 0

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
