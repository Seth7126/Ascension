// 函数: _ZN22CReliableTCPConnection17FillMessageBufferEv
// 地址: 0xbb010
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r0 = *__stack_chk_guard
int32_t* entry_r0
int32_t r0_1 = entry_r0[7]
int32_t r1 = entry_r0[8]
int32_t r6 = r0_1

if (r1 s> 0)
    r6 = 0

if (r0_1 s< 0x800)
    r6 = r0_1

uint32_t __n = 0x800 - r6

if (r1 s> r6)
    __n = 0xfffffffc - r6 + r1

if (__n s< 1)
label_bb108:
    int32_t r0_13 = *__stack_chk_guard
    
    if (r0_13 == r0)
        return r0_13 - r0
else
    int32_t r0_4 = recv(entry_r0[1], entry_r0 + r6 + 0x24, __n, 0)
    
    if (r0_4 s< 1)
        if (r0_4 != 0)
            socklen_t __optlen = 4
            int32_t __optval
            
            if (getsockopt(entry_r0[1], 1, 4, &__optval, &__optlen) == 0)
                printf("#### Network Receive error = %d\n", __optval)
            
            goto label_bb108
        
        if (*__stack_chk_guard == r0)
            jump(*(*entry_r0 + 4))
    else
        int32_t r0_5 = r0_4 + r6
        entry_r0[7] = r0_5
        
        if (r0_5 s>= 0x800 && entry_r0[8] s>= 1)
            entry_r0[7] = 0
        
        if (*__stack_chk_guard == r0)
            return time(&entry_r0[0x20a]) __tailcall

__stack_chk_fail()
noreturn
