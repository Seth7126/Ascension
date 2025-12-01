// 函数: __cxa_rethrow_primary_exception
// 地址: 0x19c584
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg1 == 0)
    return 

int32_t lr
int32_t var_4 = lr
int32_t* r0
int32_t i
r0, i = __cxa_allocate_dependent_exception()
*r0 = arg1
__dmb_ISH()

do
    *(arg1 - 0x80)
    unimplemented  {strex r2, r1, [r0]}
while (i != 0)

__dmb_ISH()
r0[1] = *(arg1 - 0x7c)
r0[3] = std::get_unexpected()
int32_t r0_4 = std::get_terminate()
r0[0xa] = 0x432b2b01
__builtin_strncpy(&r0[0xb], "GNLC", 4)
r0[4] = r0_4
void* r0_5
int32_t r3
r0_5, r3 = __cxa_get_globals(r0_4, 0x432b2b01, 0x434c4e47)
int32_t r1_4 = *(r0_5 + 4) + 1
*(r0_5 + 4) = r1_4
r0[0xc] = &data_19c5fd
sub_1a8504(&r0[0xa], r1_4, &data_19c5fd, r3)
return sub_1a9eac(&r0[0xa]) __tailcall
