// 函数: _ZN9ascension31CEventQueryCardDefeatAttributes12AddQueryCardEPKN4core13CCardInstanceEi
// 地址: 0xe8ef0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r12 = *(arg1 + 0x50)
void* lr = *(arg1 + 0x54)
*(arg1 + 0x50) = r12 + 1
int32_t* lr_1 = lr + r12 * 0x34
*lr_1 = arg2
int32_t entry_r2
lr_1[1] = entry_r2
int32_t r0_1 = *(*(arg2 + 0xc) + 0xa0)
lr_1[2] = r0_1
lr_1[3] = r0_1
lr_1[5] = 0xffffffff
lr_1[4] = 0xffffffff
__builtin_memset(&lr_1[6], 0, 0x1c)
return 0
