// 函数: sub_ecdc4
// 地址: 0xecdc4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r7 = *arg3

if (r7 != 0)
    int32_t r1_1 = *(arg2 + 0x178)
    void* r0_1
    
    if (r1_1 == r7)
        r0_1 = r7
    else
        bool cond:0_1
        
        do
            void* r0 = *(r1_1 - 0xc)
            
            if (r0 != 0)
                *(r1_1 - 8) = r0
                operator delete(r0)
            
            cond:0_1 = r7 != r1_1 - 0x1c
            r1_1 -= 0x1c
        while (cond:0_1)
        r0_1 = *arg3
    
    *(arg2 + 0x178) = r7
    operator delete(r0_1)

void* r0_2 = *(arg2 + 0x78)

if (r0_2 != 0)
    *(arg2 + 0x7c) = r0_2
    operator delete(r0_2)

void* r0_3 = *(arg2 + 0x6c)

if (r0_3 != 0)
    *(arg2 + 0x70) = r0_3
    operator delete(r0_3)

void* r0_4 = *(arg2 + 0x60)

if (r0_4 != 0)
    *(arg2 + 0x64) = r0_4
    operator delete(r0_4)

void* r0_5 = *(arg2 + 0x54)

if (r0_5 != 0)
    *(arg2 + 0x58) = r0_5
    operator delete(r0_5)

void* r0_6 = *(arg2 + 0x48)

if (r0_6 != 0)
    *(arg2 + 0x4c) = r0_6
    operator delete(r0_6)

core::CPlayerBase::~CPlayerBase()
sub_1a86c0(arg1)
noreturn
