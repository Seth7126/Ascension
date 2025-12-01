// 函数: _ZNK9ascension6CWorld9GetPlayerEi
// 地址: 0xf3940
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2_1 = *(arg1 + 0x18)
int32_t entry_r1

if (entry_r1 u< (*(arg1 + 0x1c) - r2_1) s>> 2)
    return *(r2_1 + (entry_r1 << 2))

int32_t lr
int32_t var_4 = lr
int32_t r11
int32_t var_8 = r11
return ascension::CWorld::GetPlayerByIndex(
    std::__ndk1::__vector_base_common<true>::__throw_out_of_range()) __tailcall
