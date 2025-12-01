// 函数: _ZN9ascension6CWorld20OutputAnimationHonorEiPNS_7CPlayerEPN4core9CInstanceEj
// 地址: 0xfa5ac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r4 = *__stack_chk_guard
int32_t var_34 = 0x8000001
int16_t var_30 = 5
uint32_t r4_1 = 0
char var_2e = arg2.b
uint32_t r1 = 0
int16_t var_2d = 0

if (arg4 != 0)
    r4_1 = zx.d(*(arg4 + 8))

uint32_t var_28 = r4_1

if (arg3 != 0)
    r1 = zx.d(*(arg3 + 8))

uint32_t var_24 = r1
int32_t var_20 = 0
int32_t arg_0
int32_t var_1c = arg_0
int32_t var_18 = 0
core::CWorldBase::SendStateChange(arg1, &var_34)
int32_t r0 = *__stack_chk_guard

if (r0 == r4)
    return r0 - r4

__stack_chk_fail()
noreturn
