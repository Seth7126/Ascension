// 函数: _Z8SlashifyRNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEE
// 地址: 0xba294
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r2_2 = zx.d(*arg1)
void* __offset(
    std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, 
    0x1) r1
void* r2

if ((r2_2 & 1) != 0)
    r1 = *(arg1 + 8)
    r2 = r1 + *(arg1 + 4)
else
    r1 = arg1 + 1
    r2 = r1 + (r2_2 u>> 1)

if (r1 == r2)
    return 

do
    uint32_t r3_1 = zx.d(*r1)
    
    if (r3_1 == 0x5c)
        r3_1 = 0x2f
    
    *r1 = r3_1.b
    r1 += 1
while (r2 != r1)
