// 函数: _ZN14ascensionrules27CStateProcessSetupChampions10EnterStateER13CStateMachine
// 地址: 0x164c98
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x30)
*(arg1 + 0x78) = 0
*(arg1 + 0x7c) = 0
int32_t r5_1

if ((zx.d(**(r0 + 0xa28)) & 0x80) != 0 && data_1e4478 != 0)
    r5_1 = *(arg1 + 0x34)
    int32_t i = 0
    
    do
        if (r5_1 s> 7)
            goto label_164cd0
        
        int32_t r5_3 = *(data_1e4324 + (i << 2))
        core::CWorldBase::AddInstance(*(arg1 + 0x30))
        int32_t r0_13 = *(arg1 + 0x34)
        i += 1
        void* r1_7 = arg1 + (r0_13 << 2)
        *(r1_7 + 0x58) = r0_13
        *(r1_7 + 0x38) = r5_3
        r5_1 = *(arg1 + 0x34) + 1
        *(arg1 + 0x34) = r5_1
    while (i u< data_1e4478)
else
label_164cd0:
    r5_1 = *(arg1 + 0x34)

if (r5_1 s>= 2)
    bool cond:0_1
    
    do
        int32_t* r0_4 = *(arg1 + 0x30)
        void* r1_3 = arg1 + (r5_1 << 2)
        void* r0_6 = arg1 + ((*(*r0_4 + 0xc))(r0_4, r5_1) << 2)
        cond:0_1 = r5_1 s> 2
        int32_t r2_2 = *(r1_3 + 0x54)
        *(r1_3 + 0x54) = *(r0_6 + 0x58)
        *(r0_6 + 0x58) = r2_2
        r5_1 -= 1
    while (cond:0_1)

ascension::CPlayer* r5_2 = *(arg1 + 0x30)
ascension::CWorld::GetPlayer(r5_2)
ascension::CWorld::StartTurn(r5_2)
int32_t result = *(arg1 + 0x34)
*(arg1 + 0x80) = result
return result
