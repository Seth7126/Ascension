// 函数: _ZN17CGameStateOptions12SelectOptionER13CStateMachineiPj
// 地址: 0xb842c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

bool cond:0 = arg3 s> 0
CStateMachine& entry_r12

if (arg3 s>= 0)
    entry_r12 = arg1
    cond:0 = *(arg1 + 0x38) s> arg3

if (not(cond:0))
    return 

void* r0_1 = *(entry_r12 + 0x40) + (arg3 << 4)

if (r0_1 == 0)
    return printf("    Selected Option %d: NULL\n", arg3) __tailcall

*(entry_r12 + 0x38) = 0
int32_t r2 = *(r0_1 + 8)

if (r2 == 0)
    return 

int32_t lr
int32_t var_4 = lr
*(r0_1 + 0xc)
jump(r2)
